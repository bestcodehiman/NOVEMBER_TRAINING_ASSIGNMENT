package JAVA8.STREAM.Question2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

class State {
	private Integer stateId;
	private String stateName;

	public Integer getStateId() {
		return stateId;
	}

	public void setStateId(Integer stateId) {
		this.stateId = stateId;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String statename) {
		this.stateName = stateName;
	}

	public State(Integer stateId, String stateName) {
		super();
		this.stateId = stateId;
		this.stateName = stateName;
	}

	@Override
	public String toString() {
		return "State [stateId=" + stateId + ", stateName=" + stateName + "]";
	}

}

class City {
	private Integer cityid;
	private String cityname;
	private State objState;
	private Float pollutionIndex;
	private Integer population;
	private Integer area_of_city;

	public Integer getCityid() {
		return cityid;
	}

	public void setCityid(Integer cityid) {
		this.cityid = cityid;
	}

	public String getCityname() {
		return cityname;
	}

	public void setCityname(String cityname) {
		this.cityname = cityname;
	}

	public State getObjState() {
		return objState;
	}

	public void setObjState(State objState) {
		this.objState = objState;
	}

	public Float getPollutionIndex() {
		return pollutionIndex;
	}

	public void setPollutionIndex(Float pollutionIndex) {
		this.pollutionIndex = pollutionIndex;
	}

	public Integer getPopulation() {
		return population;
	}

	public void setPopulation(Integer population) {
		this.population = population;
	}

	public Integer getArea_of_city() {
		return area_of_city;
	}

	public void setArea_of_city(Integer area_of_city) {
		this.area_of_city = area_of_city;
	}

	public City(Integer cityid, String cityname, State objState, Float pollutionIndex, Integer population,
			Integer area_of_city) {
		super();
		this.cityid = cityid;
		this.cityname = cityname;
		this.objState = objState;
		this.pollutionIndex = pollutionIndex;
		this.population = population;
		this.area_of_city = area_of_city;
	}

	@Override
	public String toString() {
		return "City [cityid=" + cityid + ", cityname=" + cityname + ", objState=" + objState + ", pollutionIndex="
				+ pollutionIndex + ", population=" + population + ", area_of_city=" + area_of_city + "]";
	}

}

public class Question2 {

	public static void main(String[] args) {
		List<City> cities = new ArrayList<City>();
		State state1 = new State(101, "MP");
		State state2 = new State(102, "MH");
		State state3 = new State(103, "GJ");
		State state4 = new State(104, "RJ");
		cities.add(new City(1, "Indore", state1, 2.3f, 60000, 50000));
		cities.add(new City(2, "Mumbai", state2, 8.5f, 800000, 100000));
		cities.add(new City(3, "Pune", state2, 5.4f, 60000, 30000));
		cities.add(new City(4, "Jaipur", state4, 2.3f, 12000, 30000));
		cities.add(new City(5, "Ahemdabad", state3, 4.0f, 230000, 100000));

		System.out
				.println(
						"Sort by area and then population using stream : \n" + cities
								.stream().sorted(Comparator.comparing(City::getArea_of_city)
										.thenComparing(City::getPopulation, (int1, int2) -> int2 - int1))
								.collect(Collectors.toList()).get(0));

		System.out.println("Sort by area and then population index : \n" + cities.stream()
				.sorted(Comparator.comparing(City::getArea_of_city, (int1, int2) -> int2 - int1)
						.thenComparing(City::getPollutionIndex, (float1, float2) -> Float.compare(float2, float1)))
				.collect(Collectors.toList()).get(0));

		System.out.println("Sort by lowest population index first : \n"
				+ cities.stream().sorted(Comparator.comparing(City::getPollutionIndex)).collect(Collectors.toList()));

		System.out.println("Sort by area and then population index : \n" + cities.stream()
				.sorted(Comparator.comparing(City::getPollutionIndex).thenComparing(City::getArea_of_city))
				.collect(Collectors.toList()).get(0));

		System.out.println(
				"Cities count in each state : \n" + cities.stream().map((value) -> value.getObjState().getStateName())
						.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())));

		System.out.println("Cities count in each state : \n" + cities.stream()
				.collect(Collectors.groupingBy(City::getObjState, Collectors.summingInt(City::getArea_of_city))));
	}
}

