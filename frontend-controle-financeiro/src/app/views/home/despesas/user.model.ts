/*List*/
export interface User {
    id: number;
    email: string;
    first_name: string;
    last_name: string;
    avatar: string;
}

export interface ResponseDespesas {
    page: number;
    per_page: number;
    total: number;
    total_pages: number;
    data: User[];
}

/*Create*/

export interface RequestCreate {
    name: string;
    job: string;
}

export interface ResponseCreate {
    name: string;
    job: string;
    id: string;
    createdAt: Date;
}

/* Get User */

export interface ResponseDespesa {
    data: User;
}

