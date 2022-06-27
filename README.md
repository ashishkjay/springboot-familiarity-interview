# Spring Rest API 

### Goal of this codebase

The goal of this codebase is to test the familiarity and understand the candidate's experience working in Spring REST
Here are the instructions to perform within the codebase

### Instructions:
- [ ] Take a look at [Postman Doc for thedogapi](https://documenter.getpostman.com/view/4016432/the-dog-api/RW81vZ4Z)
  - [ ] Create a `GET` rest endpoint with the path `/api/v1/breed/:breed_id`:
      - [ ] This will take a path param of `breed_id`
      - [ ] This will return the dog breed requested as JSON in a JSON response like below
      - [ ] Write a single test for this endpoint validating output
  - [ ] Create a `GET` rest endpoint with the path `/api/v1/breeds`:
    - [ ] This will take a query param `ids` which accepts a comma separated string eg: `/api/v1/breeds?ids=1,3,4,7,9`
    - [ ] This will return a list of dog breeds that the query param requested as JSON array of dog breed objects

### Requirements:
- [ ] Use Java Jackson class to map response JSON from **thedogapi** to create the response object (example below)
- [ ] Write with good code practices and standards. Make use of **Controller, Service and Model** etc where applicable

```python
{
  "weight": "65 - 100",  # return string of weight.imperial from dogapi
  "height": "23 - 25", # return string of height.imperial from dogapi
  "id": 9,
  "name": "Alaskan Malamute",
  "life_span": "12 - 15 years",
  "temperament": "Friendly, Affectionate, Devoted, Loyal, Dignified, Playful",
}
```


### Extra if time allows, and you are feeling fancy(choose one or the other):
- [ ] Write a custom exception handler to offer a custom message if a user passes in an invalid id for the `/api/v1/breed/:breed_id` api
- [ ] Update the `/api/v1/breeds` service to pull the n number of breed_id's asynchronously.  




