package HWOneOOP.TaskAdditional;

public class Main {
    public static void main(String[] args) {
        Address someAddress = new Address();
        someAddress.setIndex(1235);
        someAddress.setCountry("Украина");
        someAddress.setCity("Киев");
        someAddress.setStreet("переулок Охтырский");
        someAddress.setHouse("7-А");
        someAddress.setApartment(577);

        System.out.printf("Адрес отправки: \n1) индекс - %d;\n2) страна - %s;\n3) город - %s;\n4) улица - %s;\n5) дом - %s;\n6) квартира - %d."
                , someAddress.getIndex(), someAddress.getCountry(), someAddress.getCity(), someAddress.getStreet()
                , someAddress.getHouse(), someAddress.getApartment());
    }
}
