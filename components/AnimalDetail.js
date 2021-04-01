import { React, useState, useEffect } from "react";
import "bootstrap/dist/css/bootstrap.css";
import { Layout } from "./Layout";
import AnimalAttributeCard from "../components/AnimalAttributeCard";
import axios from "axios";
import ImpactCard from "./ImpactCard";

export default function AnimalDetail(props) {
  const [data, setData] = useState("");
  const [collapseBiology, setCollapseBiology] = useState(true);
  const [collapseImpact, setCollapseImpact] = useState(true);

  const handleBiology = () => {
    setCollapseBiology(!collapseBiology);
  };
  const handleImpact = () => {
    setCollapseImpact(!collapseImpact);
  };

  useEffect(async () => {
    const result = await axios.get(props.url);

    console.log(result.data);

    setData(result.data);
  }, []);

  return (
    <>
      <section class="card-about">
        <div class="card-body">
          <div class="d-flex align-items-center">
            <div class="d-block mx-2">
                <img src={data.appearanceImage} class='animal-img'/>
            </div>
            <div class="d-flex flex-column mx-2">
              <h4>Common Name: {data.commonName}</h4>
              <h4>Science Name: {data.scientificName}</h4>
              <h4>Other Common Name: {}</h4>
              <h4>Origin: {data.originPlace}</h4>
              <h4>Distribution: {data.distribution}</h4>
            </div>
          </div>
        </div>
      </section>

      <div class="card-about mt-3">
        <div class="card-header" id="headingOne">
          <h5 class="mb-0">
            <button class="btn btn-link" onClick={handleBiology}>
              Animal Biology
            </button>
          </h5>
        </div>

        <div class={`${collapseBiology ? "collapse show" : ""}  collapse`}>
          <div class="animal-section-1 d-flex">
            <AnimalAttributeCard
              title={"Apperance"}
              desc={data.appearance}
            ></AnimalAttributeCard>

            <AnimalAttributeCard
              title={"Behaviour"}
              desc={data.behaviour}
            ></AnimalAttributeCard>

            <AnimalAttributeCard
              title={"Diet"}
              desc={data.diet}
            ></AnimalAttributeCard>

            <AnimalAttributeCard
              title={"Preferred Habitat"}
              desc={data.habits}
            ></AnimalAttributeCard>

            <AnimalAttributeCard
              title={"Predators"}
              desc={data.prey}
            ></AnimalAttributeCard>
          </div>
        </div>
      </div>

      <section class="card-about mt-3">
        <div class="card-header" id="headingOne">
          <h5 class="mb-0">
            <button class="btn btn-link" onClick={handleImpact}>
              Impact
            </button>
          </h5>
        </div>

        <div class={`${collapseImpact ? "collapse show" : ""} collapse`}>
          <div class="animal-section-1 d-flex flex-column align-items-center">
            <div class="animal-section-1 d-flex">
              <ImpactCard
                title={"Impact on Ecosystem"}
                src={data.ecosystemIcon}
                desc={data.ecosystemImpact}
              ></ImpactCard>
              <ImpactCard
                title={"Economic Impact"}
                src={data.economicIcon}
                desc={data.economicImpact}
              ></ImpactCard>
            </div>

            <div class="animal-section-1 d-flex">
              <ImpactCard
                title={"Impact to Social Health"}
                src={data.socialIcon}
                desc={data.healthImpact}
              ></ImpactCard>
              <ImpactCard
                title={"Impact on Agriculture"}
                src={data.agricultureIcon}
                desc={data.agricultureImpact}
              ></ImpactCard>
            </div>
          </div>
        </div>
      </section>
    </>
  );
}
