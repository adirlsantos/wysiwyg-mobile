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
	 * @return Var
	 */
	// BlocoGrafico
	public static Var Executar() throws Exception {
		return new Callable<Var>() {

			public Var call() throws Exception {
				cronapi.chart.Operations.createChart(Var.valueOf("chart3011"), Var.valueOf("line"), Var.valueOf(""),
						Var.VAR_NULL, Var.VAR_NULL);
				return Var.VAR_NULL;
			}
		}.call();
	}

}
