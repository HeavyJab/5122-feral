import { React, useState, useEffect } from 'react'
import 'bootstrap/dist/css/bootstrap.css'
import { Layout } from './Layout'
import axios from 'axios';


export default function AnimalDetail(props) {
    const [data, setData] = useState('')

    useEffect(async () => {
        const result = await axios.get(
            props.url,
        );

        setData(result.data)
    }, [])

    return (
    <>
        <Layout>
        <div class="animal-container">
            <div class="animal-section-1">
            <h4>{props.name}</h4>
            <div class="divider"></div>
            <div class="animal-section-2"></div>
                <h4>Common Name: {data.commonName}</h4>
                <h4>Scientific Name</h4>
                <h4>Place of Origin: </h4>
                <h4>Current Population: </h4>
                <h4>Physical Eradication Methods: </h4>
                <h4>Chemical Eradication Methods</h4>
                <h4>Runnning Projects to Prevent Invasion: </h4>
                <h4>Sources/Links: </h4>
            </div>
        </div>
        </Layout>
    </>
    );
}

