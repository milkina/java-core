package pattern.decorator;

public enum Size {
    XXS(32) {
        @Override
        public String getDescription() {
            return "Детский размер";
        }
    }, XS(34), S(36), M(38), L(40);

    Size(int euroSize) {
        this.euroSize = euroSize;
    }

    private int euroSize;

    public int getEuroSize() {
        return euroSize;
    }

    public String getDescription() {
        return "Взрослый размер";
    }
}
