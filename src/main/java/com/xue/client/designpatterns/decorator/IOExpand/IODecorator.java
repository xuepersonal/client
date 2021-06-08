package com.xue.client.designpatterns.decorator.IOExpand;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * 基于java的I/O装饰器
 */
public class IODecorator extends FilterInputStream {
    /**
     * Creates a <code>FilterInputStream</code>
     * by assigning the  argument <code>in</code>
     * to the field <code>this.in</code> so as
     * to remember it for later use.
     *
     * @param in the underlying input stream, or <code>null</code> if
     *           this instance is to be created without an underlying stream.
     */
    protected IODecorator(InputStream in) {
        super(in);
    }

    @Override
    public int read() throws IOException {
        int i = super.read();
        return i == -1 ? i : Character.toLowerCase((char)i);
    }

    @Override
    public int read(byte[] b, int off, int len) throws IOException {
        int i = super.read(b, off, len);
        for (int j = off; j < off + i; j++) {
            b[i] = (byte)Character.toLowerCase((char)b[i]);
        }
        return i;
    }
}
