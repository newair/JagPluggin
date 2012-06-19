package Actions;

import com.intellij.openapi.components.ApplicationComponent;
import org.jetbrains.annotations.NotNull;

/**
 * Created with IntelliJ IDEA.
 * User: amila
 * Date: 6/19/12
 * Time: 1:52 PM
 * To change this template use File | Settings | File Templates.
 */
public class editora implements ApplicationComponent {
    public editora() {
    }

    public void initComponent() {
        // TODO: insert component initialization logic here
    }

    public void disposeComponent() {
        // TODO: insert component disposal logic here
    }

    @NotNull
    public String getComponentName() {
        return "editora";
    }
}
