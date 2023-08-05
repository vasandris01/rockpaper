public enum RPS {
    ROCK("kő"),
    PAPER("papir"),
    SCISSOR("olló");
    private String magyarNev;

    public String getMagyarNev() {
        return magyarNev;
    }

    RPS(String magyarNev) {
        this.magyarNev = magyarNev;
    }
}
