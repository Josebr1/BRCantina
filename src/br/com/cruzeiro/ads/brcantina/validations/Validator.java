/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cruzeiro.ads.brcantina.validations;

import br.com.cruzeiro.ads.brcantina.annotations.Required;
import br.com.cruzeiro.ads.brcantina.exceptions.RequiredFieldException;
import com.mysql.cj.util.StringUtils;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class Validator {
    
    public static boolean validateForNulls(Object objectToValidate) throws RequiredFieldException, ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        Field[] declaredFields = objectToValidate.getClass().getDeclaredFields();

        /**
         *  Iterate over each field to check if that field
         *  has the "Required" annotation declared for it or not
         */
        List<String> listErrors = new ArrayList<>();
        for(Field field : declaredFields) {

            Annotation annotation = field.getAnnotation(Required.class);

            /**
             *  Check if the annotation is present on that field
             */
            if (annotation != null) {

                Required required = (Required) annotation;

                /**
                 *  Check if it says this field is required
                 */
                if (required.value()) {
                    /**
                     *  Now we make sure we can access the private
                     *  fields also, so we need to call this method also
                     *  other wise we would get a {@link java.lang.IllegalAccessException}
                     */
                    field.setAccessible(true);
                    /**
                     *  If this field is required, then it should be present
                     *  in the declared fields array, if it is throw the
                     *  {@link RequiredFieldException}
                     */
                    Object t = field.get(objectToValidate);
                    
                    String msgError = new StringBuilder()
                            .append("Preenchimento do campo ")
                            .append(field.getName().substring(0,1).toUpperCase())
                            .append(field.getName().substring(1))
                            .append(" é obrigatório").toString();
                    
                    if (field.get(objectToValidate) instanceof String){
                        if(StringUtils.isNullOrEmpty((String) field.get(objectToValidate))){
                            //throw new RequiredFieldException(msgError);
                            listErrors.add(msgError);
                        }
                    }
                    if (field.get(objectToValidate) == null) {
                        //throw new RequiredFieldException(msgError);
                        listErrors.add(msgError);
                    }
                }
            }
        }
        if(listErrors.size() > 0)
            throw new RequiredFieldException(String.join("\n", listErrors));
        return true;
    }
    
}
