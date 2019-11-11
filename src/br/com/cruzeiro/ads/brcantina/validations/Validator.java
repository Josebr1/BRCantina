package br.com.cruzeiro.ads.brcantina.validations;

import br.com.cruzeiro.ads.brcantina.annotations.Email;
import br.com.cruzeiro.ads.brcantina.annotations.Password;
import br.com.cruzeiro.ads.brcantina.annotations.Required;
import br.com.cruzeiro.ads.brcantina.exceptions.RequiredFieldException;
import br.com.cruzeiro.ads.brcantina.utils.EmailUtils;
import br.com.cruzeiro.ads.brcantina.utils.PasswordUtils;
import com.mysql.cj.util.StringUtils;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class Validator {
    
    public static boolean validateForNulls(Object objectToValidate) throws RequiredFieldException, IllegalAccessException {
        Field[] declaredFields = objectToValidate.getClass().getDeclaredFields();

        List<String> listErrors = new ArrayList<>();
        for(Field field : declaredFields) {

            Annotation requiredAnnotation = field.getAnnotation(Required.class);
            Annotation emailAnnotation = field.getAnnotation(Email.class);
            Annotation passwordAnnotation = field.getAnnotation(Password.class);

            if (requiredAnnotation != null) {
                Required required = (Required) requiredAnnotation;
                if (required.value()) {
                    field.setAccessible(true);

                    String msgError = "Preenchimento do campo " +
                            field.getName().substring(0, 1).toUpperCase() +
                            field.getName().substring(1) +
                            " é obrigatório";
                    
                    if (field.get(objectToValidate) instanceof String)
                        if(StringUtils.isNullOrEmpty((String) field.get(objectToValidate))) listErrors.add(msgError);

                    if (field.get(objectToValidate) == null)  listErrors.add(msgError);
                }
            }
            if (emailAnnotation != null) {
                Email email = (Email)  emailAnnotation;
                if(email.value()){
                    field.setAccessible(true);
                    String msgError = "E-mail fornecido é invalido";
                    if (!EmailUtils.validate((String) field.get(objectToValidate)))
                        listErrors.add(msgError);
                }
            }

            if(passwordAnnotation != null) {
                Password password = (Password) passwordAnnotation;

                if (password.value()) {
                    field.setAccessible(true);
                    String msgError = "A senha fornecida é muito fraca. Ex. de Senha: 123@Mudar";
                    if(!PasswordUtils.validate((String) field.get(objectToValidate)))
                        listErrors.add(msgError);
                }
            }
        }
        if(listErrors.size() > 0)
            throw new RequiredFieldException(String.join("\n", listErrors));
        return true;
    }
    
}
