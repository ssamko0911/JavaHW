package HWNineObject.Task002;

public class Main {

    public static void main(String[] args) {

        Device device = new Device("Lenovo", 19200f, "df457jht" );
        Device monitor1 = new Monitor("DELL", 14300f, "DFG-67765-adssaskjh-88", 1270, 960);
        Device monitor2 = new Monitor("DELL", 14300f, "DFG-67765-adssaskjh-88", 1270, 960);
        Device monitor3 = new Monitor("LENOVO", 19300f, "TER89-786-FDA", 1600, 1200);
        Device ethernetAdapter = new EthernetAdapter("LINK", 100, "ghg5664", 100, "67:GH:90:TY");

        System.out.println("\ntoString:");
        System.out.println(device);
        System.out.println(monitor1);
        System.out.println("_".repeat(30));
        System.out.println("\nhashCode:");
        System.out.println(device.hashCode());
        System.out.println(monitor1.hashCode());
        System.out.println(ethernetAdapter.hashCode());
        System.out.println("_".repeat(30));
        System.out.println("\nequals:");
        System.out.println(monitor3.equals(monitor1));
        System.out.println(monitor1.equals(monitor2));
        System.out.println(ethernetAdapter.equals(monitor1));
    }
}