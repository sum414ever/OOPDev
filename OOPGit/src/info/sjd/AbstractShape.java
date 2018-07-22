package info.sjd;

public abstract class AbstractShape implements Shape{
    //Публичный абстрактный класс доступен всем, реализует методы, которые будут доступны огромному количеству обьектов одного семейства
	public abstract int getArea();
	//В нашем случае это фигуры в которых будут вычислятся площади.
}
