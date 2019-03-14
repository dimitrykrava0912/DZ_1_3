package com.company;

public class Vector3d {

    private double x_coord;
    private double y_coord;
    private double z_coord;

    private Vector3d() {
    }

    public Vector3d(double x_coord, double y_coord, double z_coord) {
        this.x_coord = x_coord;
        this.y_coord = y_coord;
        this.z_coord = z_coord;
    }

    private double getX_coord() {
        return x_coord;
    }

    public void setX_coord(double x_coord) {
        this.x_coord = x_coord;
    }

    private double getY_coord() {
        return y_coord;
    }

    public void setY_coord(double y_coord) {
        this.y_coord = y_coord;
    }

    private double getZ_coord() {
        return z_coord;
    }

    public void setZ_coord(double z_coord) {
        this.z_coord = z_coord;
    }

    public static Vector3d sum_of_vectors(Vector3d vec_one, Vector3d vec_two) {
        Vector3d res_vec = new Vector3d();

        res_vec.x_coord = vec_one.getX_coord() + vec_two.getX_coord();
        res_vec.y_coord = vec_one.getY_coord() + vec_two.getY_coord();
        res_vec.z_coord = vec_one.getZ_coord() + vec_two.getZ_coord();

        return res_vec;
    }

    public static double get_scalar(Vector3d vec_one, Vector3d vec_two) {
        return ((vec_one.getX_coord() * vec_two.getX_coord()) + (vec_one.getY_coord() * vec_two.getY_coord()) +
                (vec_one.getZ_coord() * vec_two.getZ_coord()));
    }

    public static Vector3d get_vector_mult(Vector3d vec_one, Vector3d vec_two){
        Vector3d res_vec = new Vector3d();

        res_vec.x_coord = vec_one.getY_coord()*vec_two.getZ_coord()-vec_one.getZ_coord()*vec_two.getY_coord();
        res_vec.y_coord = -(vec_one.getX_coord()*vec_two.getZ_coord()-vec_one.getZ_coord()*vec_two.getX_coord());
        res_vec.z_coord = vec_one.getX_coord()*vec_two.getY_coord()-vec_one.getY_coord()*vec_two.getX_coord();

        return res_vec;
    }

    @Override
    public String toString() {
        return "Vector3d{" +
                "x_coord=" + x_coord +
                ", y_coord=" + y_coord +
                ", z_coord=" + z_coord +
                '}';
    }
}
