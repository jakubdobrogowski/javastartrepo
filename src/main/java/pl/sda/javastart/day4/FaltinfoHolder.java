package pl.sda.javastart.day4;

public interface FaltinfoHolder {

    String STREET_PREFIX = "ul. ";

    String getStreetPrefix();

    String getFlatInfo();

    default String getFlatInfoWithPrefix() {
        return getStreetPrefix() == "" ? STREET_PREFIX + getFlatInfo() :getStreetPrefix() + getFlatInfo();
    }
}
