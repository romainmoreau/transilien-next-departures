package fr.romainmoreau.transiliennextdepartures.transilien;

import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Passages {
	private String gare;

	private List<Train> train;

	@XmlAttribute(required = true)
	public String getGare() {
		return gare;
	}

	public void setGare(String gare) {
		this.gare = gare;
	}

	@XmlElement
	public List<Train> getTrain() {
		return train;
	}

	public void setTrain(List<Train> train) {
		this.train = train;
	}
}
