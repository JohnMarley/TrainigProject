package patterns.builder;


public class Nutrients {

    private int protein;
    private int fat;
    private int carbonates;
    private int sugar;
    private int salt;

    public static Builder builder(){
        return new Builder();
    }

    public static class Builder {
        private int protein;
        private int fat;
        private int carbonates;
        private int sugar;
        private int salt;

        public Builder setProtein(int protein){
            this.protein = protein;
            return this;
        }

        public Builder setFat(int fat) {
            this.fat = fat;
            return this;
        }

        public Builder setCarbonates(int carbonates) {
            this.carbonates = carbonates;
            return this;
        }

        public Builder setSugar(int sugar) {
            this.sugar = sugar;
            return this;
        }

        public Builder setSalt(int salt) {
            this.salt = salt;
            return this;
        }

        public Nutrients build(){
            return new Nutrients(this);
        }
    }

    private Nutrients(Builder builder){
        this.protein = builder.protein;
        this.fat = builder.fat;
        this.carbonates = builder.carbonates;
        this.sugar = builder.sugar;
        this.salt = builder.salt;
    }
}
