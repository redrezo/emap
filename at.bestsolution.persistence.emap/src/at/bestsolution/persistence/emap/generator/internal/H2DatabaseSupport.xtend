package at.bestsolution.persistence.emap.generator.internal

import at.bestsolution.persistence.emap.generator.DatabaseSupport
import at.bestsolution.persistence.emap.eMap.EAttribute
import org.eclipse.emf.ecore.EDataType
import org.eclipse.emf.ecore.EEnum

class H2DatabaseSupport extends DatabaseSupport {
	
	override getAutokeyDefinition(EAttribute primaryKey) {
		return "IDENTITY";
	}
	
	override getDatabaseId() {
		return "h2"
	}
	
	override getDatabaseType(EDataType dataType) {
		if( dataType instanceof EEnum ) {
			return "varchar(255)";
		} else if( "EInteger" == dataType.name || "EIntegerObject" == dataType.name ) {
			return "integer";
		} else if( "ELong" == dataType.name || "ELongObject" == dataType.name ) {
			return "int64";
		} else if( "EDouble" == dataType.name || "EDoubleObject" == dataType.name || "EBigDecimal" == dataType.name ) {
			return "decimal";
		} else if( "EString" == dataType.name ) {
			return "varchar(255)"
		} else if( "java.sql.Clob" == dataType.instanceClassName ) {
			return "cblob"
		} else if( "java.sql.Blob" == dataType.instanceClassName ) {
			return "blob";
		} else if( "EBoolean" == dataType.name || "EBooleanObject" == dataType.name ) {
			return "smallint"
		} else if( "EDate" == dataType.name ) {
			return "timestamp";
		}
		return "***UNKOWN "+dataType.name+"***";
	}
	
	override getSequenceStatement(EAttribute primaryKey) {
		return null
	}
	
	override isPrimaryKeyPartOfColDef(EAttribute primaryKey) {
		return true
	}
	
	override processInsert(EAttribute primaryKey, String insert) {
		return insert;
	}
	
	override supportsGeneratedKeys() {
		return true
	}
	
}