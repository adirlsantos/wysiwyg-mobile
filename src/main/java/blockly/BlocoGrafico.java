package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;

@CronapiMetaData(type = "blockly")
@CronappSecurity
public class BlocoGrafico {

	public static final int TIMEOUT = 300;

	/**
	 *
	 * @param param
	 * @return Var
	 */
	// BlocoGrafico
	public static Var Executar(Var param) throws Exception {
		return new Callable<Var>() {

			public Var call() throws Exception {
				System.out.println(Var.valueOf("Teste teste").getObjectAsString());
				return Var.VAR_NULL;
			}
		}.call();
	}

}
