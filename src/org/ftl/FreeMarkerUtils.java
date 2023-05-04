/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ftl;

import java.util.Arrays;
import java.util.List;
import org.ftl.lexer.SJTokenId;

public class FreeMarkerUtils {

    public static List<SJTokenId> getTokensList() {
        return Arrays.<SJTokenId>asList(new SJTokenId[]{
            new SJTokenId("EOF", "keyword", FMParserConstants.EOF),
            new SJTokenId("BLANK", "keyword", FMParserConstants.BLANK),
            new SJTokenId("START_TAG", "keyword", FMParserConstants.START_TAG),
            new SJTokenId("END_TAG", "keyword", FMParserConstants.END_TAG),
            new SJTokenId("CLOSE_TAG1", "keyword", FMParserConstants.CLOSE_TAG1),
            new SJTokenId("CLOSE_TAG2", "keyword", FMParserConstants.CLOSE_TAG2),
            new SJTokenId("ATTEMPT", "keyword", FMParserConstants.ATTEMPT),
            new SJTokenId("RECOVER", "keyword", FMParserConstants.RECOVER),
            new SJTokenId("IF", "statement", FMParserConstants.IF),
            new SJTokenId("ELSE_IF", "statement", FMParserConstants.ELSE_IF),
            new SJTokenId("LIST", "keyword", FMParserConstants.LIST),
            new SJTokenId("FOREACH", "keyword", FMParserConstants.FOREACH),
            new SJTokenId("SWITCH", "keyword", FMParserConstants.SWITCH),
            new SJTokenId("CASE", "keyword", FMParserConstants.CASE),
            new SJTokenId("ASSIGN", "statement", FMParserConstants.ASSIGN),
            new SJTokenId("GLOBALASSIGN", "keyword", FMParserConstants.GLOBALASSIGN),
            new SJTokenId("LOCALASSIGN", "keyword", FMParserConstants.LOCALASSIGN),
            new SJTokenId("INCLUDE", "statement", FMParserConstants._INCLUDE),
            new SJTokenId("IMPORT", "statement", FMParserConstants.IMPORT),
            new SJTokenId("FUNCTION", "keyword", FMParserConstants.FUNCTION),
            new SJTokenId("MACRO", "statement", FMParserConstants.MACRO),
            new SJTokenId("TRANSFORM", "keyword", FMParserConstants.TRANSFORM),
            new SJTokenId("VISIT", "keyword", FMParserConstants.VISIT),
            new SJTokenId("STOP", "keyword", FMParserConstants.STOP),
            new SJTokenId("RETURN", "keyword", FMParserConstants.RETURN),
            new SJTokenId("CALL", "braces", FMParserConstants.CALL),
            new SJTokenId("SETTING", "keyword", FMParserConstants.SETTING),
            new SJTokenId("COMPRESS", "keyword", FMParserConstants.COMPRESS),
            new SJTokenId("COMMENT", "comment", FMParserConstants.COMMENT),
            new SJTokenId("TERSE_COMMENT", "comment", FMParserConstants.TERSE_COMMENT),
            new SJTokenId("NOPARSE", "keyword", FMParserConstants.NOPARSE),
            new SJTokenId("END_IF", "statement", FMParserConstants.END_IF),
            new SJTokenId("END_LIST", "keyword", FMParserConstants.END_LIST),
            new SJTokenId("END_RECOVER", "keyword", FMParserConstants.END_RECOVER),
            new SJTokenId("END_ATTEMPT", "keyword", FMParserConstants.END_ATTEMPT),
            new SJTokenId("END_FOREACH", "keyword", FMParserConstants.END_FOREACH),
            new SJTokenId("END_LOCAL", "keyword", FMParserConstants.END_LOCAL),
            new SJTokenId("END_GLOBAL", "keyword", FMParserConstants.END_GLOBAL),
            new SJTokenId("END_ASSIGN", "statement", FMParserConstants.END_ASSIGN),
            new SJTokenId("END_FUNCTION", "keyword", FMParserConstants.END_FUNCTION),
            new SJTokenId("END_MACRO", "keyword", FMParserConstants.END_MACRO),
            new SJTokenId("END_COMPRESS", "keyword", FMParserConstants.END_COMPRESS),
            new SJTokenId("END_TRANSFORM", "keyword", FMParserConstants.END_TRANSFORM),
            new SJTokenId("END_SWITCH", "keyword", FMParserConstants.END_SWITCH),
            new SJTokenId("ELSE", "keyword", FMParserConstants.ELSE),
            new SJTokenId("BREAK", "keyword", FMParserConstants.BREAK),
            new SJTokenId("SIMPLE_RETURN", "keyword", FMParserConstants.SIMPLE_RETURN),
            new SJTokenId("HALT", "keyword", FMParserConstants.HALT),
            new SJTokenId("FLUSH", "keyword", FMParserConstants.FLUSH),
            new SJTokenId("TRIM", "keyword", FMParserConstants.TRIM),
            new SJTokenId("LTRIM", "keyword", FMParserConstants.LTRIM),
            new SJTokenId("RTRIM", "keyword", FMParserConstants.RTRIM),
            new SJTokenId("NOTRIM", "keyword", FMParserConstants.NOTRIM),
            new SJTokenId("DEFAUL", "keyword", FMParserConstants.DEFAUL),
            new SJTokenId("SIMPLE_NESTED", "keyword", FMParserConstants.SIMPLE_NESTED),
            new SJTokenId("NESTED", "keyword", FMParserConstants.NESTED),
            new SJTokenId("SIMPLE_RECURSE", "keyword", FMParserConstants.SIMPLE_RECURSE),
            new SJTokenId("RECURSE", "keyword", FMParserConstants.RECURSE),
            new SJTokenId("FALLBACK", "keyword", FMParserConstants.FALLBACK),
            new SJTokenId("ESCAPE", "keyword", FMParserConstants.ESCAPE),
            new SJTokenId("END_ESCAPE", "keyword", FMParserConstants.END_ESCAPE),
            new SJTokenId("NOESCAPE", "keyword", FMParserConstants.NOESCAPE),
            new SJTokenId("END_NOESCAPE", "keyword", FMParserConstants.END_NOESCAPE),
            new SJTokenId("UNIFIED_CALL", "braces", FMParserConstants.UNIFIED_CALL),
            new SJTokenId("UNIFIED_CALL_END", "braces", FMParserConstants.UNIFIED_CALL_END),
            new SJTokenId("FTL_HEADER", "keyword", FMParserConstants.FTL_HEADER),
            new SJTokenId("TRIVIAL_FTL_HEADER", "keyword", FMParserConstants.TRIVIAL_FTL_HEADER),
            new SJTokenId("UNKNOWN_DIRECTIVE", "braces", FMParserConstants.UNKNOWN_DIRECTIVE),
            new SJTokenId("WHITESPACE", "keyword", FMParserConstants.WHITESPACE),
            new SJTokenId("PRINTABLE_CHARS", "braces", FMParserConstants.PRINTABLE_CHARS),
            new SJTokenId("FALSE_ALERT", "braces", FMParserConstants.FALSE_ALERT),
            new SJTokenId("OUTPUT_ESCAPE", "braces", FMParserConstants.OUTPUT_ESCAPE),
            new SJTokenId("NUMERICAL_ESCAPE", "braces", FMParserConstants.NUMERICAL_ESCAPE),
            new SJTokenId("A_73", "braces", FMParserConstants.A_73),
            new SJTokenId("A_74", "braces", FMParserConstants.A_74),
            new SJTokenId("A_75", "braces", FMParserConstants.A_75),
            new SJTokenId("A_76", "braces", FMParserConstants.A_76),
            new SJTokenId("A_77", "braces", FMParserConstants.A_77),
            new SJTokenId("A_78", "braces", FMParserConstants.A_78),
            new SJTokenId("A_79", "braces", FMParserConstants.A_79),
            new SJTokenId("ESCAPED_CHAR", "keyword", FMParserConstants.ESCAPED_CHAR),
            new SJTokenId("STRING_LITERAL", "literal", FMParserConstants.STRING_LITERAL),
            new SJTokenId("RAW_STRING", "literal", FMParserConstants.RAW_STRING),
            new SJTokenId("FALSE", "keyword", FMParserConstants.FALSE),
            new SJTokenId("TRUE", "keyword", FMParserConstants.TRUE),
            new SJTokenId("INTEGER", "keyword", FMParserConstants.INTEGER),
            new SJTokenId("DECIMAL", "keyword", FMParserConstants.DECIMAL),
            new SJTokenId("DOT", "keyword", FMParserConstants.DOT),
            new SJTokenId("DOT_DOT", "keyword", FMParserConstants.DOT_DOT),
            new SJTokenId("BUILT_IN", "keyword", FMParserConstants.BUILT_IN),
            new SJTokenId("EXISTS", "keyword", FMParserConstants.EXISTS),
            new SJTokenId("EQUALS", "equals", FMParserConstants.EQUALS),
            new SJTokenId("DOUBLE_EQUALS", "keyword", FMParserConstants.DOUBLE_EQUALS),
            new SJTokenId("NOT_EQUALS", "keyword", FMParserConstants.NOT_EQUALS),
            new SJTokenId("LESS_THAN", "braces", FMParserConstants.LESS_THAN),
            new SJTokenId("LESS_THAN_EQUALS", "braces", FMParserConstants.LESS_THAN_EQUALS),
            new SJTokenId("ESCAPED_GT", "braces", FMParserConstants.ESCAPED_GT),
            new SJTokenId("ESCAPED_GTE", "braces", FMParserConstants.ESCAPED_GTE),
            new SJTokenId("PLUS", "keyword", FMParserConstants.PLUS),
            new SJTokenId("MINUS", "keyword", FMParserConstants.MINUS),
            new SJTokenId("TIMES", "keyword", FMParserConstants.TIMES),
            new SJTokenId("DOUBLE_STAR", "keyword", FMParserConstants.DOUBLE_STAR),
            new SJTokenId("ELLIPSIS", "keyword", FMParserConstants.ELLIPSIS),
            new SJTokenId("DIVIDE", "keyword", FMParserConstants.DIVIDE),
            new SJTokenId("PERCENT", "keyword", FMParserConstants.PERCENT),
            new SJTokenId("AND", "keyword", FMParserConstants.AND),
            new SJTokenId("OR", "keyword", FMParserConstants.OR),
            new SJTokenId("EXCLAM", "keyword", FMParserConstants.EXCLAM),
            new SJTokenId("COMMA", "keyword", FMParserConstants.COMMA),
            new SJTokenId("SEMICOLON", "keyword", FMParserConstants.SEMICOLON),
            new SJTokenId("COLON", "keyword", FMParserConstants.COLON),
            new SJTokenId("OPEN_BRACKET", "braces", FMParserConstants.OPEN_BRACKET),
            new SJTokenId("CLOSE_BRACKET", "braces", FMParserConstants.CLOSE_BRACKET),
            new SJTokenId("OPEN_PAREN", "braces", FMParserConstants.OPEN_PAREN),
            new SJTokenId("CLOSE_PAREN", "braces", FMParserConstants.CLOSE_PAREN),
            new SJTokenId("OPEN_BRACE", "braces", FMParserConstants.OPEN_BRACE),
            new SJTokenId("CLOSE_BRACE", "braces", FMParserConstants.CLOSE_BRACE),
            new SJTokenId("IN", "keyword", FMParserConstants.IN),
            new SJTokenId("AS", "statement", FMParserConstants.AS),
            new SJTokenId("USING", "keyword", FMParserConstants.USING),
            new SJTokenId("ID", "id", FMParserConstants.ID),
            new SJTokenId("LETTER", "keyword", FMParserConstants.LETTER),
            new SJTokenId("DIGIT", "keyword", FMParserConstants.DIGIT),
            new SJTokenId("DIRECTIVE_END", "braces", FMParserConstants.DIRECTIVE_END),
            new SJTokenId("EMPTY_DIRECTIVE_END", "braces", FMParserConstants.EMPTY_DIRECTIVE_END),
            new SJTokenId("NATURAL_GT", "braces", FMParserConstants.NATURAL_GT),
            new SJTokenId("NATURAL_GTE", "braces", FMParserConstants.NATURAL_GTE),
            new SJTokenId("TERMINATING_WHITESPACE", "keyword", FMParserConstants.TERMINATING_WHITESPACE),
            new SJTokenId("TERSE_COMMENT_END", "comment", FMParserConstants.TERSE_COMMENT_END),
            new SJTokenId("MAYBE_END", "comment", FMParserConstants.MAYBE_END),
            new SJTokenId("KEEP_GOING", "comment", FMParserConstants.KEEP_GOING),
            new SJTokenId("LONE_LESS_THAN_OR_DASH", "keyword", FMParserConstants.LONE_LESS_THAN_OR_DASH),});
    }
}
