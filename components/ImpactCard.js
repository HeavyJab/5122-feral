import { React, useState } from 'react'
import ReactCardFlip from 'react-card-flip';

const ImpactCard = (props) => {
    const [isFlipped, setIsFlipped] = useState(false)

    const handleFlip = (e) => {
        e.preventDefault();
        setIsFlipped(!isFlipped);
    }
    const {title, desc, src} = props;
    return (
      <ReactCardFlip isFlipped={isFlipped} flipDirection="vertical">
        <div class="card" onClick={handleFlip}>
          <img class="card-img-top" src={src} alt="Card image cap" />
          <div class="card-body">
            <h5 class="card-title">{title}</h5>
          </div>
        </div>

        <div class="card" onClick={handleFlip}>
          <div class="card-body">
            <h5 class="card-title">{title}</h5>
            <p class="card-text">
              {desc}
            </p>
          </div>
        </div>
      </ReactCardFlip>
    );
}

export default ImpactCard;