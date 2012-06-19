package newair.org;

import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.SyntaxHighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.tree.IElementType;
import gnu.trove.THashMap;
import org.jetbrains.annotations.NotNull;
/**
 * Created with IntelliJ IDEA.
 * User: amila
 * Date: 6/8/12
 * Time: 1:00 PM
 * To change this template use File | Settings | File Templates.
 */

public class SyntaxHighlightHandler extends SyntaxHighlighterBase {


    @NotNull
    @Override
    public Lexer getHighlightingLexer() {
        return new JaggeryHighlightingLexer();  //To change body of implemented methods use File | Settings | File Templates.
    }


    @NotNull
    @Override
    public TextAttributesKey[] getTokenHighlights(IElementType iElementType) {


        return pack(keys1.get(iElementType),keys2.get(iElementType));  //To change body of implemented methods use File | Settings | File Templates.


    }


    public static final TextAttributesKey JAGGERY_KEY = TextAttributesKey.createTextAttributesKey(
            "JAGGERY.KEY",
            SyntaxHighlighterColors.KEYWORD.getDefaultAttributes()
    );


    public static final TextAttributesKey JAGGERY_VALUE = TextAttributesKey.createTextAttributesKey(
            "JAGGERY.VALUE",
            SyntaxHighlighterColors.STRING.getDefaultAttributes()



    );


    public static final TextAttributesKey JAGGERY_DOCCOMMENT = TextAttributesKey.createTextAttributesKey(
            "JAGGERY.DOCCOMMENT",
            SyntaxHighlighterColors.DOC_COMMENT.getDefaultAttributes()



    );

    private static THashMap<IElementType,TextAttributesKey> keys1;
    private static THashMap<IElementType,TextAttributesKey> keys2;

    static {

        keys1.put(JaggeryTokenTypes.KEY_CHARACTERS, JAGGERY_KEY);
        keys1.put(JaggeryTokenTypes.VALUE_CHARACTERS, JAGGERY_VALUE);


    }






























}
