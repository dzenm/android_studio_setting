#if (${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end

/**
 * @author ${USER}
 * @date   ${DATE} ${TIME} 
 * @IDE    ${PRODUCT_NAME}
 */
#if (${IMPORT_BLOCK} != "")${IMPORT_BLOCK}
#end
#parse("File Header.java")
#if (${VISIBILITY} == "PUBLIC")public #end enum ${NAME} #if (${INTERFACES} != "")implements ${INTERFACES} #end {
}