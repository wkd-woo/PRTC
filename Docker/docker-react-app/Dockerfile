FROM node:alpine as builder

RUN cd usr \
    && mkdir src && mkdir src/app

RUN chmod -R 777 /usr/src/app

WORKDIR /usr/src/app

COPY package.json ./

RUN npm install

COPY ./ ./

RUN npm run build

FROM nginx

COPY --from=builder /usr/src/app/build /usr/share/nginx/html