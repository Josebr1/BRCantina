-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               8.0.17 - MySQL Community Server - GPL
-- Server OS:                    Win64
-- HeidiSQL Version:             10.2.0.5637
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Dumping database structure for brcantina
DROP DATABASE IF EXISTS `brcantina`;
CREATE DATABASE IF NOT EXISTS `brcantina` /*!40100 DEFAULT CHARACTER SET utf8 */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `brcantina`;

-- Dumping structure for table brcantina.categoria
CREATE TABLE IF NOT EXISTS `categoria` (
  `id_categoria` int(11) NOT NULL,
  `descricao` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id_categoria`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Data exporting was unselected.

-- Dumping structure for table brcantina.categoria_conta
CREATE TABLE IF NOT EXISTS `categoria_conta` (
  `id_tipo_conta` int(11) NOT NULL,
  `descricao` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id_tipo_conta`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Data exporting was unselected.

-- Dumping structure for table brcantina.cliente
CREATE TABLE IF NOT EXISTS `cliente` (
  `id_cliente` int(11) NOT NULL,
  `nome` varchar(150) DEFAULT NULL,
  `documento` varchar(14) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `data_nasciemento` datetime DEFAULT NULL,
  `sexo` enum('MASCULINO','FEMININO') DEFAULT NULL,
  `fone` varchar(11) DEFAULT NULL,
  `fk_endereco` int(11) NOT NULL,
  PRIMARY KEY (`id_cliente`),
   FOREIGN KEY (`fk_endereco`) REFERENCES `endereco` (`id_endereco`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Data exporting was unselected.

-- Dumping structure for table brcantina.conta_pagar
CREATE TABLE IF NOT EXISTS `conta_pagar` (
  `id_conta_pagar` int(11) NOT NULL,
  `categoria` varchar(45) DEFAULT NULL,
  `descricao` varchar(255) DEFAULT NULL,
  `vencimento` date DEFAULT NULL,
  `valor` decimal(10,0) DEFAULT NULL,
  `conta_paga` tinyint(1) DEFAULT NULL,
  `data_pagamento` date DEFAULT NULL,
  `valor_pago` decimal(10,0) DEFAULT NULL,
  `fk_fornecedor_id_fornecedor` int(11) NOT NULL,
  `fk_categoria_conta` int(11) NOT NULL,
  PRIMARY KEY (`id_conta_pagar`),
  FOREIGN KEY (`fk_categoria_conta`) REFERENCES `categoria_conta` (`id_tipo_conta`),
  FOREIGN KEY (`fk_fornecedor_id_fornecedor`) REFERENCES `fornecedor` (`id_fornecedor`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Data exporting was unselected.

-- Dumping structure for table brcantina.conta_receber
CREATE TABLE IF NOT EXISTS `conta_receber` (
  `id_conta_receber` int(11) NOT NULL,
  `tipo_conta` varchar(45) DEFAULT NULL,
  `valor` decimal(10,0) DEFAULT NULL,
  `data_credito` date DEFAULT NULL,
  `observacao` varchar(255) DEFAULT NULL,
  `fk_foma_pagamento` int(11) NOT NULL,
  PRIMARY KEY (`id_conta_receber`),
  FOREIGN KEY (`fk_foma_pagamento`) REFERENCES `foma_pagamento` (`id_foma_pagamento`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Data exporting was unselected.

-- Dumping structure for table brcantina.endereco
CREATE TABLE IF NOT EXISTS `endereco` (
  `id_endereco` int(11) NOT NULL,
  `cep` varchar(8) NOT NULL,
  `endereco` varchar(255) NOT NULL,
  `bairro` varchar(150) NOT NULL,
  `cidade` varchar(150) NOT NULL,
  `referencia` varchar(255) DEFAULT NULL,
  `numero` varchar(255) NOT NULL,
  `complemento` varchar(255) DEFAULT NULL,
  `uf` varchar(2) NOT NULL,
  PRIMARY KEY (`id_endereco`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Data exporting was unselected.

-- Dumping structure for table brcantina.estoque
CREATE TABLE IF NOT EXISTS `estoque` (
  `id_estoque` int(11) NOT NULL,
  `quantidade_atual` mediumtext,
  `valor_custo` decimal(10,0) DEFAULT NULL,
  `fk_produto` int(11) NOT NULL,
  PRIMARY KEY (`id_estoque`),
  FOREIGN KEY (`fk_produto`) REFERENCES `produto` (`id_produto`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Data exporting was unselected.

-- Dumping structure for table brcantina.ficha_tecnica
CREATE TABLE IF NOT EXISTS `ficha_tecnica` (
  `id_ficha_tecnica` int(11) NOT NULL,
  `insumo_item` varchar(45) DEFAULT NULL,
  `fk_insumo` int(11) NOT NULL,
  `fk_produto` int(11) NOT NULL,
  PRIMARY KEY (`id_ficha_tecnica`),
  KEY `fk_td_ficha_tecnica_insumo1_idx` (`fk_insumo`),
  KEY `fk_td_ficha_tecnica_produto1_idx` (`fk_produto`),
  CONSTRAINT `fk_td_ficha_tecnica_insumo1` FOREIGN KEY (`fk_insumo`) REFERENCES `insumo` (`id_insumo`),
  CONSTRAINT `fk_td_ficha_tecnica_produto1` FOREIGN KEY (`fk_produto`) REFERENCES `produto` (`id_produto`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Data exporting was unselected.

-- Dumping structure for table brcantina.foma_pagamento
CREATE TABLE IF NOT EXISTS `foma_pagamento` (
  `id_foma_pagamento` int(11) NOT NULL,
  `descricao` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id_foma_pagamento`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Data exporting was unselected.

-- Dumping structure for table brcantina.fornecedor
CREATE TABLE IF NOT EXISTS `fornecedor` (
  `id_fornecedor` int(11) NOT NULL,
  `nome` varchar(45) DEFAULT NULL,
  `fone` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `documento` varchar(45) DEFAULT NULL,
  `IERG` varchar(45) DEFAULT NULL,
  `fk_endereco` int(11) NOT NULL,
  PRIMARY KEY (`id_fornecedor`),
  FOREIGN KEY (`fk_endereco`) REFERENCES `endereco` (`id_endereco`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Data exporting was unselected.

-- Dumping structure for table brcantina.insumo
CREATE TABLE IF NOT EXISTS `insumo` (
  `id_insumo` int(11) NOT NULL,
  `nome` varchar(45) DEFAULT NULL,
  `preco_custo` decimal(10,0) DEFAULT NULL,
  `medida` enum('UN','KG','LT') DEFAULT NULL,
  `cod_sistema` varchar(45) DEFAULT NULL,
  `cod_personalizado` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id_insumo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Data exporting was unselected.

-- Dumping structure for table brcantina.item_pedido
CREATE TABLE IF NOT EXISTS `item_pedido` (
  `id_item_pedido` int(11) NOT NULL,
  `quantidade` varchar(45) DEFAULT NULL,
  `fk_produto` int(11) NOT NULL,
  `fk_pedido` int(11) NOT NULL,
  PRIMARY KEY (`id_item_pedido`),
  FOREIGN KEY (`fk_produto`) REFERENCES `produto` (`id_produto`),
  FOREIGN KEY (`fk_pedido`) REFERENCES `pedido` (`id_pedido`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Data exporting was unselected.

-- Dumping structure for table brcantina.pagamento
CREATE TABLE IF NOT EXISTS `pagamento` (
  `id_pagamento` int(11) NOT NULL,
  `descricao` varchar(45) DEFAULT NULL,
  `data_pagamento` date DEFAULT NULL,
  `fk_foma_pagamento` int(11) NOT NULL,
  `fk_pedido` int(11) NOT NULL,
  PRIMARY KEY (`id_pagamento`,`fk_foma_pagamento`),
  FOREIGN KEY (`fk_foma_pagamento`) REFERENCES `foma_pagamento` (`id_foma_pagamento`),
  FOREIGN KEY (`fk_pedido`) REFERENCES `pedido` (`id_pedido`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Data exporting was unselected.

-- Dumping structure for table brcantina.pedido
CREATE TABLE IF NOT EXISTS `pedido` (
  `id_pedido` int(11) NOT NULL,
  `observacao` varchar(45) DEFAULT NULL,
  `fk_cliente` int(11) NOT NULL,
  `fk_usuario` varchar(255) NOT NULL,
  PRIMARY KEY (`id_pedido`),
  FOREIGN KEY (`fk_cliente`) REFERENCES `cliente` (`id_cliente`),
  FOREIGN KEY (`fk_usuario`) REFERENCES `usuario` (`id_usuario`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Data exporting was unselected.

-- Dumping structure for table brcantina.produto
CREATE TABLE IF NOT EXISTS `produto` (
  `id_produto` int(11) NOT NULL,
  `nome` varchar(45) DEFAULT NULL,
  `preco_custo` decimal(10,0) DEFAULT NULL,
  `preco_venda` decimal(10,0) DEFAULT NULL,
  `medida` enum('UN','KG','LT') DEFAULT NULL,
  `codigo_pesonalizado` varchar(45) DEFAULT NULL,
  `descricao` varchar(255) DEFAULT NULL,
  `foto` longblob,
  `fk_categoria_conta` int(11) NOT NULL,
  PRIMARY KEY (`id_produto`),
  FOREIGN KEY (`fk_categoria_conta`) REFERENCES `categoria` (`id_categoria`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Data exporting was unselected.

-- Dumping structure for table brcantina.tipo_usuario
CREATE TABLE IF NOT EXISTS `tipo_usuario` (
  `id_tipo_usuario` int(11) NOT NULL AUTO_INCREMENT,
  `descricao` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id_tipo_usuario`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- Data exporting was unselected.

-- Dumping structure for table brcantina.usuario
CREATE TABLE IF NOT EXISTS `usuario` (
  `id_usuario` varchar(255) NOT NULL,
  `nome` varchar(150) NOT NULL,
  `email` varchar(100) NOT NULL,
  `tem_acesso_programa` tinyint(4) NOT NULL,
  `login` varchar(45) NOT NULL,
  `senha` longtext NOT NULL,
  `ativo` tinyint(4) NOT NULL,
  `fk_tipo_usuario` int(11) NOT NULL,
  PRIMARY KEY (`id_usuario`),
  FOREIGN KEY (`fk_tipo_usuario`) REFERENCES `tipo_usuario` (`id_tipo_usuario`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Data exporting was unselected.

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
