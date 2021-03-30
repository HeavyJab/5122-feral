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
          <h3>Meet the Team</h3>
          <div class="animal-section-2 d-flex justify-content-center">
            <Card
              title={"Chengguang Li"}
              src={"/team/1.png"}
              href={"/about"}
            ></Card>
            <Card
              title={"Naureen Mukri"}
              src={"/team/2.png"}
              href={"/about"}
            ></Card>
            <Card
              title={"Vincent Lam"}
              src={"/team/3.png"}
              href={"/about"}
            ></Card>
            <Card
              title={"Haowei Zhang"}
              src={"/team/4.png"}
              href={"/about"}
            ></Card>
            <Card
              title={"Ruixin Wang"}
              src={"/team/5.png"}
              href={"/about"}
            ></Card>
          </div>
        </div>
      </div>
    </Layout>
  );
}
