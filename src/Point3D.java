public class Point3D extends Point2D {
    private float z = 0.0f;

    public Point3D(){

    }

    public Point3D(float x,float y, float z){
        super(x,y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x,float y, float z){
        this.setX(x);
        this.setY(y);
        this.setZ(z);
    }

    public float[] getXYZ(){
        float[] arr = new float[3];
        super.getXY();
        arr[2] = getZ();
        return arr;
    }

    @Override
    public String toString() {
        return "(" + getX() + " ," + getY() +" , " + getZ() + ")";
    }
}
