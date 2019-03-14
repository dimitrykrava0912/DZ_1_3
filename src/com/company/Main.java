package com.company;
//Описать класс «Vector3d» (т. е., он должен описывать вектор в трехмерной,
//декартовой системе координат). В качестве свойств этого класса возьмите
//координаты вектора. Для этого класса реализовать методы сложения, скалярного и
//векторного произведения векторов. Создайте несколько объектов этого класса и
//протестируйте их.

public class Main {

    public static void main(String[] args) {
	// write your code here
        Vector3d a = new Vector3d(12,9,14);
        Vector3d b = new Vector3d(8,3,5);

        System.out.println(a.toString());

        System.out.println(b.toString());

        Vector3d c =Vector3d.sum_of_vectors(a,b);
        System.out.println("Сложение векторов a + b = ");
        System.out.println(c.toString());

        c=Vector3d.get_vector_mult(a,b);
        System.out.println("Векторное произведение a * b = ");
        System.out.println(c.toString());

        System.out.println("Скалярное произведение a * b = ");
        double scal=Vector3d.get_scalar(a,b);
        System.out.println(scal);

        System.out.println();




    }
}
