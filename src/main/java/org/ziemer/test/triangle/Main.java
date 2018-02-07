package org.ziemer.test.triangle;

import org.apache.commons.lang.StringUtils;

public class Main {
    public static void main(String[] args) {
        if (args.length > 0) {
            for (String arg : args) {
                if (!StringUtils.isNumeric(arg)) System.out.println("You can only provide numbers");
            }
        }
        if (args.length == 3) {
            System.out.println(Triangle.determine(Long.parseLong(args[0]), Long.parseLong(args[1]), Long.parseLong(args[2])));
        } else {
            System.out.println("You need to provide 3 values");
        }
    }
}
