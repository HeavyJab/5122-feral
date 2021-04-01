import {React, useState} from 'react'
import ReactCardFlip from 'react-card-flip';


const AnimalAttributeCard = (props) => {
    const {title, desc} = props;

    return (
      <div>
        <div class="card">
          <div class="card-body">
            <h5 class="card-title">{title}</h5>
            <p class="card-text">
              {desc}
            </p>
          </div>
        </div>
      </div>
    );
}

export default AnimalAttributeCard