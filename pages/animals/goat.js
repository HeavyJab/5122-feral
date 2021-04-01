import 'bootstrap/dist/css/bootstrap.css'
import { Layout } from '../../components/Layout'
import AnimalDetail from '../../components/AnimalDetail';
import { useState } from 'react';
import AnimalNav from '../../components/AnimalNav'

export default function Animals() {
  return (
    <>
      <Layout>
        <AnimalNav>
          <AnimalDetail
          url={'https://ie-iteration1.herokuapp.com/api/goat'}
          ></AnimalDetail>
        </AnimalNav>
      </Layout>
    </>
  );
}
