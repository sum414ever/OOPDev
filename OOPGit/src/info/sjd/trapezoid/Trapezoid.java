package info.sjd.trapezoid;
//—сылка на пакет
import info.sjd.AbstractShape;
//»мпортируем методы реализованные в AbstractShape
public class Trapezoid extends AbstractShape {
	//ѕубличный класс трапеци€ использует характеристики другого класса, у нас это площадь
	private int BaseA;
	//ƒоступна€ только в этом классе стала€
	private int BaseB;

	private int Height;

	public int getBaseA() {
		return BaseA;
	}

	public void setBaseA(int baseA) {
		BaseA = baseA;
	}
	//get и set дает возможность принимать и передавать приватные данные через публичный метод другим обьектам
	public int getBaseB() {
		return BaseB;
	}

	public void setBaseB(int baseB) {
		BaseB = baseB;
	}

	public int getHeight() {
		return Height;
	}

	public void setHeight(int height) {
		Height = height;
	}

	@Override
	public int getArea() {
		return (int) ((BaseA + BaseB) * Height / 2);
	}
	//ѕолиморфизм, перенос площиди с AbstractShape с изменени€ми, ретурн выполн€ет две функции - конец метода и возвращение данных, в нашем случае это интовое значение площади трапеции
}
