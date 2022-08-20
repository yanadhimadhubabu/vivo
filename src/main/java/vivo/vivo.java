
package vivo;

import org.apache.felix.gogo.commands.Command;
import org.apache.karaf.shell.console.OsgiCommandSupport;


/**
 * Displays the last log entries
 */
@Command(scope = "org.vivo.com", name = "vivo", description = "vivo")
public class vivo extends OsgiCommandSupport {

    protected Object doExecute() throws Exception {
         System.out.println("Executing command vivo");
         return null;
    }
}
