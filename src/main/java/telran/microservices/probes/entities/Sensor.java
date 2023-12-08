package telran.microservices.probes.entities;
import jakarta.persistence.*;
@Entity
@Table(name="sensors")
public class Sensor {
	@Id
	long id;
	String purpose;
	double minValue;
	double maxValue;
}
