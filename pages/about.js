import Head from "next/head";
import "bootstrap/dist/css/bootstrap.css";
import { Layout } from "../components/Layout";
import Link from "next/link";
import { Card } from "../components/Card";

export default function Home() {
  return (
    <Layout>
      <div class="animal-container">
        <div class="animal-section-1 d-flex flex-column align-items-center">
            <img class='large-logo'  src="/logo-large.png"/>
            
            <h3>Our Vision</h3>
            <h4>
              We are a group of feral (non) enthusiasts and this is a joint
              initiative taken by us to help the lands of Farmers in Victoria
              being invaded by these species by providing information to
              identify and eradicate feral animals
            </h4>
          <div class="animal-section-1 d-flex justify-content-center">
            <Card
              desc={"Raising awareness on the Impact of Invasive Animals on Agriculture by providing information on the declared established pest animals in Victoria"}
              title={'Mission'}
              src={"/mission.png"}
            ></Card>
            <Card
              desc={"We help identify, prevent, control and eradicate pest animals from farmlands in Victoria in order to increase Agriculture Productivity"}
              title={'Vision'}
              src={"/vision.jpeg"}
            ></Card>
            <Card
              desc={"Increase Farmer's Productivity, Promote Urban Wilderness, Keep Livestock and Native animals safe"}
              title={'Values'}
              src={"/values.png"}
            ></Card>
          </div>
        </div>
      </div>
    </Layout>
  );
}
