PGDMP                         x           CRM    12.2    12.2 %    <           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false            =           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false            >           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false            ?           1262    17194    CRM    DATABASE     �   CREATE DATABASE "CRM" WITH TEMPLATE = template0 ENCODING = 'UTF8' LC_COLLATE = 'Spanish_Spain.1252' LC_CTYPE = 'Spanish_Spain.1252';
    DROP DATABASE "CRM";
                postgres    false            �            1259    17228 	   customers    TABLE     5  CREATE TABLE public.customers (
    id bigint NOT NULL,
    idcustomer integer NOT NULL,
    name character varying(100) NOT NULL,
    surname character varying(100) NOT NULL,
    company character varying(100) NOT NULL,
    adress character varying(300) NOT NULL,
    city character varying(100) NOT NULL
);
    DROP TABLE public.customers;
       public         heap    postgres    false            �            1259    17223 	   employees    TABLE     3  CREATE TABLE public.employees (
    id bigint NOT NULL,
    dni character varying(9),
    name character varying(20) NOT NULL,
    surname character varying(100) NOT NULL,
    "position" character varying(50) NOT NULL,
    userlogin character varying(50) NOT NULL,
    pass character varying(8) NOT NULL
);
    DROP TABLE public.employees;
       public         heap    postgres    false            �            1259    17256    relacustomersemployees    TABLE     �   CREATE TABLE public.relacustomersemployees (
    id bigint NOT NULL,
    idemployee bigint NOT NULL,
    idcustomer bigint NOT NULL
);
 *   DROP TABLE public.relacustomersemployees;
       public         heap    postgres    false            �            1259    17286    relacustomertasksemployees    TABLE       CREATE TABLE public.relacustomertasksemployees (
    id bigint NOT NULL,
    idemployee bigint NOT NULL,
    idcustomer bigint NOT NULL,
    idtask bigint NOT NULL,
    date timestamp without time zone NOT NULL,
    description text NOT NULL,
    valuehours double precision NOT NULL
);
 .   DROP TABLE public.relacustomertasksemployees;
       public         heap    postgres    false            �            1259    17236    relarolesemployees    TABLE        CREATE TABLE public.relarolesemployees (
    id bigint NOT NULL,
    idrole bigint NOT NULL,
    idemployee bigint NOT NULL
);
 &   DROP TABLE public.relarolesemployees;
       public         heap    postgres    false            �            1259    17271    relatasksemployees    TABLE        CREATE TABLE public.relatasksemployees (
    id bigint NOT NULL,
    idemployee bigint NOT NULL,
    idtask bigint NOT NULL
);
 &   DROP TABLE public.relatasksemployees;
       public         heap    postgres    false            �            1259    17218    roles    TABLE     c   CREATE TABLE public.roles (
    id bigint NOT NULL,
    namerole character varying(20) NOT NULL
);
    DROP TABLE public.roles;
       public         heap    postgres    false            �            1259    17251    tasks    TABLE     ~   CREATE TABLE public.tasks (
    id bigint NOT NULL,
    name character varying(50),
    description character varying(200)
);
    DROP TABLE public.tasks;
       public         heap    postgres    false            4          0    17228 	   customers 
   TABLE DATA           Y   COPY public.customers (id, idcustomer, name, surname, company, adress, city) FROM stdin;
    public          postgres    false    204   2       3          0    17223 	   employees 
   TABLE DATA           X   COPY public.employees (id, dni, name, surname, "position", userlogin, pass) FROM stdin;
    public          postgres    false    203   /2       7          0    17256    relacustomersemployees 
   TABLE DATA           L   COPY public.relacustomersemployees (id, idemployee, idcustomer) FROM stdin;
    public          postgres    false    207   L2       9          0    17286    relacustomertasksemployees 
   TABLE DATA           w   COPY public.relacustomertasksemployees (id, idemployee, idcustomer, idtask, date, description, valuehours) FROM stdin;
    public          postgres    false    209   i2       5          0    17236    relarolesemployees 
   TABLE DATA           D   COPY public.relarolesemployees (id, idrole, idemployee) FROM stdin;
    public          postgres    false    205   �2       8          0    17271    relatasksemployees 
   TABLE DATA           D   COPY public.relatasksemployees (id, idemployee, idtask) FROM stdin;
    public          postgres    false    208   �2       2          0    17218    roles 
   TABLE DATA           -   COPY public.roles (id, namerole) FROM stdin;
    public          postgres    false    202   �2       6          0    17251    tasks 
   TABLE DATA           6   COPY public.tasks (id, name, description) FROM stdin;
    public          postgres    false    206   �2       �
           2606    17235    customers customers_pkey 
   CONSTRAINT     V   ALTER TABLE ONLY public.customers
    ADD CONSTRAINT customers_pkey PRIMARY KEY (id);
 B   ALTER TABLE ONLY public.customers DROP CONSTRAINT customers_pkey;
       public            postgres    false    204            �
           2606    17227    employees employees_pkey 
   CONSTRAINT     V   ALTER TABLE ONLY public.employees
    ADD CONSTRAINT employees_pkey PRIMARY KEY (id);
 B   ALTER TABLE ONLY public.employees DROP CONSTRAINT employees_pkey;
       public            postgres    false    203            �
           2606    17260 2   relacustomersemployees relacustomersemployees_pkey 
   CONSTRAINT     p   ALTER TABLE ONLY public.relacustomersemployees
    ADD CONSTRAINT relacustomersemployees_pkey PRIMARY KEY (id);
 \   ALTER TABLE ONLY public.relacustomersemployees DROP CONSTRAINT relacustomersemployees_pkey;
       public            postgres    false    207            �
           2606    17293 :   relacustomertasksemployees relacustomertasksemployees_pkey 
   CONSTRAINT     x   ALTER TABLE ONLY public.relacustomertasksemployees
    ADD CONSTRAINT relacustomertasksemployees_pkey PRIMARY KEY (id);
 d   ALTER TABLE ONLY public.relacustomertasksemployees DROP CONSTRAINT relacustomertasksemployees_pkey;
       public            postgres    false    209            �
           2606    17240 *   relarolesemployees relarolesemployees_pkey 
   CONSTRAINT     h   ALTER TABLE ONLY public.relarolesemployees
    ADD CONSTRAINT relarolesemployees_pkey PRIMARY KEY (id);
 T   ALTER TABLE ONLY public.relarolesemployees DROP CONSTRAINT relarolesemployees_pkey;
       public            postgres    false    205            �
           2606    17275 *   relatasksemployees relatasksemployees_pkey 
   CONSTRAINT     h   ALTER TABLE ONLY public.relatasksemployees
    ADD CONSTRAINT relatasksemployees_pkey PRIMARY KEY (id);
 T   ALTER TABLE ONLY public.relatasksemployees DROP CONSTRAINT relatasksemployees_pkey;
       public            postgres    false    208            �
           2606    17222    roles roles_pkey 
   CONSTRAINT     N   ALTER TABLE ONLY public.roles
    ADD CONSTRAINT roles_pkey PRIMARY KEY (id);
 :   ALTER TABLE ONLY public.roles DROP CONSTRAINT roles_pkey;
       public            postgres    false    202            �
           2606    17255    tasks tasks_pkey 
   CONSTRAINT     N   ALTER TABLE ONLY public.tasks
    ADD CONSTRAINT tasks_pkey PRIMARY KEY (id);
 :   ALTER TABLE ONLY public.tasks DROP CONSTRAINT tasks_pkey;
       public            postgres    false    206            �
           2606    17266 =   relacustomersemployees relacustomersemployees_idcustomer_fkey    FK CONSTRAINT     �   ALTER TABLE ONLY public.relacustomersemployees
    ADD CONSTRAINT relacustomersemployees_idcustomer_fkey FOREIGN KEY (idcustomer) REFERENCES public.customers(id) ON UPDATE CASCADE ON DELETE CASCADE;
 g   ALTER TABLE ONLY public.relacustomersemployees DROP CONSTRAINT relacustomersemployees_idcustomer_fkey;
       public          postgres    false    2720    204    207            �
           2606    17261 =   relacustomersemployees relacustomersemployees_idemployee_fkey    FK CONSTRAINT     �   ALTER TABLE ONLY public.relacustomersemployees
    ADD CONSTRAINT relacustomersemployees_idemployee_fkey FOREIGN KEY (idemployee) REFERENCES public.employees(id) ON UPDATE CASCADE ON DELETE CASCADE;
 g   ALTER TABLE ONLY public.relacustomersemployees DROP CONSTRAINT relacustomersemployees_idemployee_fkey;
       public          postgres    false    207    203    2718            �
           2606    17299 E   relacustomertasksemployees relacustomertasksemployees_idcustomer_fkey    FK CONSTRAINT     �   ALTER TABLE ONLY public.relacustomertasksemployees
    ADD CONSTRAINT relacustomertasksemployees_idcustomer_fkey FOREIGN KEY (idcustomer) REFERENCES public.customers(id) ON UPDATE CASCADE ON DELETE CASCADE;
 o   ALTER TABLE ONLY public.relacustomertasksemployees DROP CONSTRAINT relacustomertasksemployees_idcustomer_fkey;
       public          postgres    false    209    2720    204            �
           2606    17294 E   relacustomertasksemployees relacustomertasksemployees_idemployee_fkey    FK CONSTRAINT     �   ALTER TABLE ONLY public.relacustomertasksemployees
    ADD CONSTRAINT relacustomertasksemployees_idemployee_fkey FOREIGN KEY (idemployee) REFERENCES public.employees(id) ON UPDATE CASCADE ON DELETE CASCADE;
 o   ALTER TABLE ONLY public.relacustomertasksemployees DROP CONSTRAINT relacustomertasksemployees_idemployee_fkey;
       public          postgres    false    209    2718    203            �
           2606    17304 A   relacustomertasksemployees relacustomertasksemployees_idtask_fkey    FK CONSTRAINT     �   ALTER TABLE ONLY public.relacustomertasksemployees
    ADD CONSTRAINT relacustomertasksemployees_idtask_fkey FOREIGN KEY (idtask) REFERENCES public.tasks(id) ON UPDATE CASCADE ON DELETE CASCADE;
 k   ALTER TABLE ONLY public.relacustomertasksemployees DROP CONSTRAINT relacustomertasksemployees_idtask_fkey;
       public          postgres    false    209    206    2724            �
           2606    17246 5   relarolesemployees relarolesemployees_idemployee_fkey    FK CONSTRAINT     �   ALTER TABLE ONLY public.relarolesemployees
    ADD CONSTRAINT relarolesemployees_idemployee_fkey FOREIGN KEY (idemployee) REFERENCES public.employees(id) ON UPDATE CASCADE ON DELETE CASCADE;
 _   ALTER TABLE ONLY public.relarolesemployees DROP CONSTRAINT relarolesemployees_idemployee_fkey;
       public          postgres    false    2718    203    205            �
           2606    17241 1   relarolesemployees relarolesemployees_idrole_fkey    FK CONSTRAINT     �   ALTER TABLE ONLY public.relarolesemployees
    ADD CONSTRAINT relarolesemployees_idrole_fkey FOREIGN KEY (idrole) REFERENCES public.roles(id) ON UPDATE CASCADE ON DELETE CASCADE;
 [   ALTER TABLE ONLY public.relarolesemployees DROP CONSTRAINT relarolesemployees_idrole_fkey;
       public          postgres    false    205    202    2716            �
           2606    17276 5   relatasksemployees relatasksemployees_idemployee_fkey    FK CONSTRAINT     �   ALTER TABLE ONLY public.relatasksemployees
    ADD CONSTRAINT relatasksemployees_idemployee_fkey FOREIGN KEY (idemployee) REFERENCES public.employees(id) ON UPDATE CASCADE ON DELETE CASCADE;
 _   ALTER TABLE ONLY public.relatasksemployees DROP CONSTRAINT relatasksemployees_idemployee_fkey;
       public          postgres    false    2718    208    203            �
           2606    17281 1   relatasksemployees relatasksemployees_idtask_fkey    FK CONSTRAINT     �   ALTER TABLE ONLY public.relatasksemployees
    ADD CONSTRAINT relatasksemployees_idtask_fkey FOREIGN KEY (idtask) REFERENCES public.tasks(id) ON UPDATE CASCADE ON DELETE CASCADE;
 [   ALTER TABLE ONLY public.relatasksemployees DROP CONSTRAINT relatasksemployees_idtask_fkey;
       public          postgres    false    208    2724    206            4      x������ � �      3      x������ � �      7      x������ � �      9      x������ � �      5      x������ � �      8      x������ � �      2      x������ � �      6      x������ � �     