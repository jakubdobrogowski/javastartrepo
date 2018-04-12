package pl.sda.javastart.day3;

public class Player {

    private String nick;
    private String character;

    public Player(String nick, String character) {
        this.nick = nick;
        this.character = character;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getCharacter() {
        return character;
    }

    public void setCharacter(String character) {
        this.character = character;
    }

    @Override
    public String toString() {
        return "Player{" +
                "nick='" + nick + '\'' +
                ", character='" + character + '\'' +
                '}';
    }
}
