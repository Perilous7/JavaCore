package java8Excise.Optional;

import java.util.Optional;

public class OptionalExample {
    public class Computer{
        private Optional<Headset> headset;

        public Optional<Headset> getHeadset() {
            return headset;
        }

        public void setHeadset(Optional<Headset> headset) {
            this.headset = headset;
        }
    }

    public class Headset{
        private Optional<Microphone> microphone;
        private Optional<Microphone> getMicrophone(){
            return this.microphone;
        }

        public void setMicrophone(Optional<Microphone> microphone) {
            this.microphone = microphone;
        }
    }

    public class Microphone{
        private String version;

        public Microphone(String version) {
            this.version = version;
        }

        public String getVersion() {
            return version;
        }

        public void setVersion(String version) {
            this.version = version;
        }
    }

    public static void main(String[] args){
        OptionalExample oe = new OptionalExample();
        Microphone mc = oe.new Microphone("1.1");
        Headset hs = oe.new Headset();
        //hs.setMicrophone(Optional.of(mc));
        hs.setMicrophone(Optional.empty());
        Computer pc = oe.new Computer();
        pc.setHeadset(Optional.of(hs));

        String name = Optional.of(pc).flatMap(Computer::getHeadset)
                .flatMap(Headset::getMicrophone)
                .map(Microphone::getVersion)
                .orElse("UNKNOWN");
        System.out.println(name);
    }
}
