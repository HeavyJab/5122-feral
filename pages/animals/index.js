import 'bootstrap/dist/css/bootstrap.css'
import { Layout } from '../../components/Layout'
import { Card } from '../../components/Card'

export default function Home() {


  return (
    <>
      <Layout>
        <div class="animal-container">
          <div class="animal-section-1">
            <h4>How well do you know your feral animals?</h4>
            <div class='divider'></div>
            <div class="animal-section-2 d-flex justify-content-center">
              <Card
                title={"Feral Fox (Vulpes Vulpes)"}
                src={"/fox.png"}
                href={"/"}
              ></Card>
              <Card
                title={"Feral European Rabbit (Oryctolagus cuniculus) "}
                src={"/rabbit.png"}
                href={"/"}
              ></Card>
              <Card
                title={"Feral Cat (Felis catus) "}
                src={"/cat.png"}
                href={"/"}
              ></Card>
              <Card
                title={"Feral Goat (Capra hircus)"}
                src={"/goat.png"}
                href={"/"}
              ></Card>
              <Card
                title={"Feral Pig (Sus scrofa)"}
                src={"/pig.png"}
                href={"/"}
              ></Card>
            </div>
          </div>
        </div>
      </Layout>
    </>
  );
}
