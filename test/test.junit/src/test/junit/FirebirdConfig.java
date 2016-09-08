package test.junit;

import org.firebirdsql.jdbc.FBDriver;
import org.osgi.service.component.annotations.Component;

import at.bestsolution.persistence.java.JDBCConfiguration;

@Component
public class FirebirdConfig implements JDBCConfiguration {

	@Override
	public String getId() {
		return "Firebird";
	}

	@Override
	public String getUsername() {
		return "RETAILADMIN";
	}

	@Override
	public String getPassword() {
		return "170306";
	}

	@Override
	public String getConnectionURL() {
		return "jdbc:firebirdsql://localhost//tmp/blub.fdb";
	}

	@Override
	public Class<?> getJDBCDriver() {
		return FBDriver.class;
	}

	@Override
	public String getDatabaseType() {
		return "Firebirdxx";
	}

}
