package newair.org;

import com.intellij.ide.FileEditorProvider;
import com.intellij.openapi.application.ApplicationManager;
import com.intellij.openapi.fileEditor.FileEditor;

/**
 * Created with IntelliJ IDEA.
 * User: amila
 * Date: 6/18/12
 * Time: 9:56 PM
 * To change this template use File | Settings | File Templates.
 */


public class FileProvider implements FileEditorProvider {


    @Override
    public FileEditor openFileEditor() {


        return ApplicationManager.getApplication().getComponent(FileProvider.class).openFileEditor();  //To change body of implemented methods use File | Settings | File Templates.

    }



}
