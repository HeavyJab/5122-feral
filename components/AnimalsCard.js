import { useState } from 'react'
import ReactCardFlip from 'react-card-flip';
import Link from 'next/link'


const AnimalCard = (props) =>{
    const {name, sciName, desc, url, img} = props;
    const [isFlipped, setIsFlipped] = useState(false)

    const handleFlip = (e) => {
        e.preventDefault();
        setIsFlipped(!isFlipped);
    }

    return (
      <ReactCardFlip isFlipped={isFlipped} flipDirection="vertical">
        <div class="card" onClick={handleFlip}>
            <img src={img} class="card-img-top" alt="image of a fox"/>
            <div class="card-body">
                <h5 class="card-title">{name}</h5>
            </div>
        </div>

        <div class="card" onClick={handleFlip}>
        <div class="card-body">
            <h5 class="card-title">{name}</h5>
            <h6 class="card-subtitle mb-2 text-muted">{sciName}</h6>
            <p class="card-text">{desc}</p>
            <Link href={url}>
                <a class="btn btn-primary">Know more</a>
            </Link>
        </div>
        </div>
      </ReactCardFlip>
    );
}

export default AnimalCard