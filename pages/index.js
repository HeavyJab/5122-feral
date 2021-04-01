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
        <div class="first d-flex align-items-center">
        <div>
          <h2>
            Australia is home to many animals that have been introduced since
            European Settlement. Some of these are invasive - creating
            significant problems for Agriculture in Victoria.
          </h2>
          <div class="d-flex justify-content-center">
            <button class="btn btn-secondary btn-lg">
              <a  href='#second'>
              KNOW MORE
              </a>
            </button>
          </div>
        </div>
      </div>

        <Carousel 
        showThumbs={false}
        interval={3000}
        autoPlay={true}
        infiniteLoop={true}
        centerMode={true}
        centerSlidePercentage={100}
        >
          <div>
            <img src="/photo-1.jpeg"/>
          </div>
          <div>
            <img src="/pig.png"/>
          </div>
          <div>
            <img src="/dog.jpeg"/>
          </div>
        </Carousel>

      <AnimalSection></AnimalSection>


      </Layout>
    </>
  );
}
