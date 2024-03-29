package com.example.borjabravo.focusresize;

import java.io.InputStream;
import java.io.OutputStream;

public class Utils {

    /**
     * 读写流
     * 读取流，并写出
     *
     * @param is
     * @param os
     */
    public static void CopyStream(InputStream is, OutputStream os) {
        final int buffer_size = 1024;
        try {
            byte[] bytes = new byte[buffer_size];
            for (; ; ) {
                int count = is.read(bytes, 0, buffer_size);
                if (count == -1)
                    break;
                os.write(bytes, 0, count);
            }
        } catch (Exception ex) {
        }
    }
}