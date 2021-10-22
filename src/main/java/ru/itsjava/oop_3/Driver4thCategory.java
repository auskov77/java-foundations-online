package ru.itsjava.oop_3;

public class Driver4thCategory extends CarDriver{
    public Driver4thCategory() {
        super("4-й", "Управление легковыми автомобилями всех типов, грузовыми автомобилями грузоподъемностью до 10 тонн, автобусами габаритной длиной до 7 метров", "Назначение, устройство, принцип действия и работу агрегатов, механизмов и приборов обслуживаемых автомобилей, ПДД и ТТХ автомобилей");
    }

    public void toEliminationMalfunctions(){
        System.out.println("Знать причины, способы обнаружения и устранения неисправностей, возникших в процессе эксплуатации автомобиля");
    }
}
