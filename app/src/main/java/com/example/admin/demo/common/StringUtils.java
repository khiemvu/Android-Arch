package com.example.admin.demo.common;

import com.google.gson.Gson;

import java.math.BigDecimal;
import java.text.Normalizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * User: khiemvx
 * Date: 10/02/14
 */
public class StringUtils
{
    public static final String EMPTY = "";

    public static boolean isEmpty(CharSequence cs)
    {
        return cs == null || cs.length() == 0;
    }

    public static boolean isNotEmpty(CharSequence cs)
    {
        return !StringUtils.isEmpty(cs);
    }

    public static String trimToEmpty(String str)
    {
        return str == null ? EMPTY : str.trim();
    }

    public static boolean isBlank(CharSequence cs)
    {
        int strLen;
        if (cs == null || (strLen = cs.length()) == 0)
        {
            return true;
        }
        for (int i = 0; i < strLen; i++)
        {
            if ((Character.isWhitespace(cs.charAt(i)) == false))
            {
                return false;
            }
        }
        return true;
    }

    public static boolean isNotBlank(CharSequence cs)
    {
        return !StringUtils.isBlank(cs);
    }

    public static String trim(String str)
    {
        return str == null ? null : str.trim();
    }

    public static StringBuffer appendTo(StringBuffer head, String separator, String tail)
    {

        if (StringUtils.isEmpty(tail))
        {
            return head;
        }
        else if (head.length() == 0)
        {
            return head.append(tail);
        }
        else
        {
            return head.append(separator).append(tail);
        }
    }

    public static StringBuffer insertInFront(String head, String separator, StringBuffer tail)
    {

        if (StringUtils.isEmpty(head))
        {
            return tail;
        }
        else if (tail.length() == 0)
        {
            return tail.insert(0, head);
        }
        else
        {
            return tail.insert(0, separator).insert(0, head);
        }
    }

    public static String formatStringReplaceAllSpace(String editable)
    {
        String enter = String.valueOf(editable);
        return enter.replaceAll(" +", " ").trim();
    }

    public static String getNotNullString(String value)
    {
        return value == null ? "" : value;
    }

    public static String removeWhiteSpace(String value)
    {
        if (value == null)
        {
            return "";
        }
        return value.replaceAll("\\s+", "");
    }

    public static String upperFirstChar(String str)
    {
        if (StringUtils.isEmpty(str))
        {
            return "";
        }
        return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
    }

    public static String removeFirstChar(String s)
    {
        return s.substring(1);
    }

    public static String removeLastChar(String s)
    {
        return s.substring(0, s.length() - 1);
    }

    public static boolean isNumeric(String str)
    {
        return !(str == null || isEmpty(str)) && str.matches("-?\\d+(\\.\\d+)?");
    }

    public static boolean isEmpty(BigDecimal value)
    {
        return value == null || value.equals(BigDecimal.ZERO);
    }

    public static boolean equals(String s1, String s2)
    {
        s1 = s1 == null ? "" : s1;
        s2 = s2 == null ? "" : s2;
        return s1.equals(s2);
    }

    public static String toJson(Object obj)
    {
        if (obj == null)
        {
            return null;
        }
        return new Gson().toJson(obj);
    }

    public static boolean containBothNumberAndLetter(String text)
    {
        Pattern pattern = Pattern.compile("^(?=.*[a-zA-Z])(?=.*[0-9])");
        Matcher matcher = pattern.matcher(text);
        return matcher.find();
    }

    public static String removeAccents(String text)
    {
        String string = Normalizer.normalize(text, Normalizer.Form.NFD);
        return string.replaceAll("[^\\p{ASCII}]", "");
    }
}
