package org.example.snyk;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class DeserializationEx {
    static class EvilGadget implements Serializable {
        private String command;
        public EvilGadget(String command) {
            this.command = command;
        }
        private void readObject(ObjectInputStream in) throws Exception {
            in.defaultReadObject();
            Runtime.getRuntime().exec(command);
        }
    }

    public static void main(String[] args) throws IOException {
        var gadget = new EvilGadget("dir .");
        //InputStream is = new ObjectInputStream();
        //gadget.readObject();
    }
}
