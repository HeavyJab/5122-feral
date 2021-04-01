import styles from '../styles/Home.module.css';
import 'bootstrap/dist/css/bootstrap.css';
import { Layout } from '../components/Layout';
import AnimalSection from '../components/AnimalSection'
import { Carousel } from 'react-responsive-carousel';
import "react-responsive-carousel/lib/styles/carousel.min.css"; // requires a loader

export default function Home() {


  return (
    <>
      <Layout>
        <Carousel 
        showThumbs={false}
        interval={3000}
        autoPlay={true}
        infiniteLoop={true}
        centerMode={true}
        centerSlidePercentage={100}
        dynamicHeight={true}
        >
          <div>
            <img src="/carousel-1.jpeg"/>
            <p className="legend">Predation on Livestock - Invasive Animals kill livestock and native animals in many places around
            Victoria by preying on them.</p>
          </div>
          <div>
            <img src="/carousel-2.jpeg"/>
            <p className="legend">Grazing on Crops and Pasture - Invasive Animals have spread across Australia to the point where they
            cause severe damage to farmlands by grazing pressure on pastures, crops and native
            plant communities.</p>
          </div>
          <div>
            <img src="/carousel-3.jpeg"/>
            <p className="legend">Spreading Weeds - Invasive species impact farm productivity by spreading weeds by
            dropping weed seeds on their way. Presence of weeds on farmlands increases the
            cost of agriculture and hinders the progress of work</p>
          </div>
          <div>
            <img src="/carousel-4.jpeg"/>
            <p className="legend">Contribution to Erosion - One of the major adverse impacts of invasive animals is erosion. They cause
            significant damage to farmlands that trigger immense landslides and soil loss.</p>
          </div>
          <div>
            <img src="/carousel-5.jpeg"/>
            <p className="legend">Land and Water Degradation - Without control on farmlands, these animals become pests and injure the land and
              water causing them to degrade – thereby reducing the overall productivity of
              Agriculture</p>
          </div>
        </Carousel>

      <AnimalSection></AnimalSection>


      </Layout>
    </>
  );
}
