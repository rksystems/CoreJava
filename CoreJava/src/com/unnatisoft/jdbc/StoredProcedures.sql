DELIMITER $$

USE `ebuy`$$

DROP PROCEDURE IF EXISTS `my_proc_OUT`$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `my_proc_OUT`(OUT highest INT)
BEGIN 
SELECT MAX(CategoryID) INTO highest FROM item;
END$$

DELIMITER ;