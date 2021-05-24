
SUMMARY = "An extension to the Django web framework that provides version control for model instances."
HOMEPAGE = "http://github.com/etianen/django-reversion"
AUTHOR = "Dave Hall <dave@etianen.com>"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=84c0e05cb245221cc83d9ea801ee34b6"

SRC_URI = "https://files.pythonhosted.org/packages/93/d4/ee328caa4b4dfd1cec2185c63cc349f3d45de6293920889273ae0c6db3bd/django-reversion-3.0.9.tar.gz"
SRC_URI[md5sum] = "b6c45e9e5a6bacaf587488ab928932e4"
SRC_URI[sha256sum] = "a5af55f086a3f9c38be2f049c251e06005b9ed48ba7a109473736b1fc95a066f"

S = "${WORKDIR}/django-reversion-3.0.9"

RDEPENDS_${PN} = "python3-django"

inherit setuptools3
