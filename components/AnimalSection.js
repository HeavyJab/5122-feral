import React from "react";
import AnimalsCard from "../components/AnimalsCard";

const AnimalSection = () => {
  return (
    <div class="animal-container">
        <div class="card-about mt-3">
          <div class="card-header">
            <h5 class="mb-0">
              <button class="btn">Established Pest Animals in Victoria</button>
            </h5>
          </div>
          <div class="animal-section-1 d-flex">
          <AnimalsCard
            name={"Feral Fox"}
            sciName={"Vulpes Vulpes"}
            desc={
              "Foxes are an established pest animal in the state of Victoria"
            }
            url={"/animals/fox"}
            img={"/fox.png"}
          ></AnimalsCard>

          <AnimalsCard
            name={"Feral European Rabbit"}
            sciName={"Oryctolagus Cuniculus"}
            desc={
              "Rabbits have been significant pests in Australia since they were released near Geelong, Victoria in 1860."
            }
            url={"/animals/rabbit"}
            img={"/rabbit.png"}
          ></AnimalsCard>

          <AnimalsCard
            name={"Feral Goat"}
            sciName={"Capra Hircus"}
            desc={
              "Foxes are an established pest animal in the state of Victoria"
            }
            url={"/animals/goat"}
            img={"/goat.png"}
          ></AnimalsCard>

          <AnimalsCard
            name={"Feral Pig"}
            sciName={"Sus Scrofa"}
            desc={
              "Feral pigs are a serious environmental and agricultural pest across Victoria"
            }
            url={"/animals/pig"}
            img={"/pig.png"}
          ></AnimalsCard>

          <AnimalsCard
            name={"Feral Dog"}
            sciName={"Sus Scrofa"}
            desc={
              "The feral and wild populations of dogs are an established pest animal under the Catchment and Land Protection Act (1994) in Victoria."
            }
            url={"/animals/dog"}
            img={"/dog.jpeg"}
          ></AnimalsCard>
        </div>
        </div>
    </div>
  );
};

export default AnimalSection;
