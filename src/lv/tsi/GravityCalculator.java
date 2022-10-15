package lv.tsi;

public class GravityCalculator {
    static final double GRAVITY = -9.81;
    public int fallingTime;
    public double initialPosition;
    public double initialVelocity;

    public void Converter(float fallingTime, float initialPosition, float initialVelocity) {
        this.fallingTime = (int) fallingTime;
        this.initialPosition = (double) initialPosition;
        this.initialVelocity = (double) initialVelocity;
    }

    public void Converter(float fallingTime, float initialVelocity) {
        this.Converter(fallingTime, initialVelocity, 0.0F);
    }

    public void Converter(float fallingTime) {
        this.Converter(fallingTime, 0.0F, 0.0F);
    }

    public void Converter() {
        this.Converter(0.0F, 0.0F, 0.0F);
    }

    public double finalPosition() {
        return (double) (this.fallingTime * this.fallingTime) * GRAVITY  * 0.5 + this.initialVelocity * (double) this.fallingTime + this.initialPosition;
    }
}
