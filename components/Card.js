import React from 'react'

export const Card = (props) => {
    const {title, src, href} = props;
    return (
        <div class="card">
        <img src={src} class="card-img-top" alt="..."/>
        <div class="card-body d-flex justify-content-center">
                <h5 class="card-title">
                    {title}
                </h5>
        </div>
        </div>
    )   
}